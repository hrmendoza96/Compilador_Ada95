procedure ProcedimientoUno is      
   varUno: Integer;
   varDos: Integer;    

   procedure ProcedimientoDos () is 
      varTres: Float;
      procedure ProcedimientoTres () is
         varCuatro: Integer;
      begin
         put("Adios");
      end ProcedimientoTres;
      procedure Probemos() is
         varX: Integer;
      begin
         Put("test");
      end Probemos;
   begin 
      put("Hola");
   end ProcedimientoDos; 

   procedure ProcedimientoNuevo () is
      varNueva: Boolean;
   begin
      put("Hola");
   end ProcedimientoNuevo;

  

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