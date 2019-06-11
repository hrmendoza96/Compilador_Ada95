procedure ProcedimientoUno  is      
   varUNO: Integer;  
   varUNO:=1;
   procedure ProcedimientoDos () is 
      varDOS, varDOSTest: Float;
      
      procedure ProcedimientoTres () is
         varTRES: String;
         
         procedure ProcedimientoCuatro () is
            varCUATRO: Boolean;
         begin
            put("Texto Procedimiento CUATRO");
         end ProcedimientoCuatro;

      begin
         put("Texto Procedimiento TRES");
      end ProcedimientoTres;

   begin 
      put("Texto Procedimiento DOS");
   end ProcedimientoDos; 

   varFueraUNO, varPruebaFueraUno: Integer;

   procedure ProdDentroUno (W, X, M, D: IN Integer; P: IN String; Z: IN Boolean) is
      varCINCO, varPruebaBooleano: Boolean;
      
      procedure ProdAnidado () is
         varAnid, varPruebaString: String;
         procedure ProdAnidadoDOS (S: IN Integer) is
         varAnidDOS, varPruebaStringDOS: String;
         begin
            Put("Texto del ANIDADO");
         end ProdAnidadoDOS;
      begin
         Put("Texto del ANIDADO");
      end ProdAnidado;

      function FactorialDOS (L: IN Integer) return Integer is
         varPruebaFunction: Integer;
         procedure ProdAnidadoDOSCUATRO (T: IN Integer) is
         varPruebaFunctionPROCED: Integer;
         begin
            Put("Texto del ANIDADO");
         end ProdAnidadoDOSCUATRO;
      begin
         if L = 1 then
            return 1;
         else
            return L * FactorialDOS (L - 1);
            end if;
      end FactorialDOS;


   begin
      put("Texto Procedimiento DESPUES DE LOS ANIDADOS.");
   end DentroUno;

   function Factorial (N: Integer) return Integer is
   begin
      if N = 1 then
         return 1;
      else
         return N * Factorial (N - 1);
       end if;
   end Factorial;

begin
   loop
      -- Print the display.
      Put(Disp);
      -- Promt the user.
      Put("> ");
      -- Skip leading blanks and read the operation.
      loop
         Get(Op);
         exit when Op /= 1;
      end loop;
      -- Stop when we're s'posed to.
      -- Read the integer value (skips leading blanks) and discard the
      -- remainder of the line.
      Get(In_Val);
      exit when Op = 1 or Op = 2;
   end loop;
end ProcedimientoUno;

