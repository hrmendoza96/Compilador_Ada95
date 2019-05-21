procedure Calc is
   Op: Integer;               
   Disp: Integer := 0;          
   In_Val2: Integer := 10; 
   Otra_tontera: Integer := 10;                 
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