procedure ProcedimientoUno is      
   var_P13: Integer;
   var_P14: Integer;    

   procedure ProcedimientoDos () is 
      var_P21: Float;
   begin 
      put("Hola");
   end Operacion; 

   procedure ProcedimientoTres () is
      var_P31: Integer;
      
      procedure ProcedimietoCuatro () is
         var_P41: Float;
      begin 
         put("Hey");
      end ProcedimietoCuatro;

   begin
      put("Adios");
   end ProcedimientoTres; 

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