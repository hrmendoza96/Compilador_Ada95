procedure ProcedimientoUno is      
   varUNO: Integer;  

   procedure ProcedimientoDos () is 
      varDOS: Float;
      
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

   varFueraUNO: Integer;

   procedure ProdDentroUno () is
      varCINCO: Boolean;
      
      procedure ProdAnidado () is
         varAnid: String;
      begin
         Put("Texto del ANIDADO");
      end ProdAnidado;

   begin
      put("Texto Procedimiento DESPUES DE LOS ANIDADOS.");
   end DentroUno;

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
end Calc;