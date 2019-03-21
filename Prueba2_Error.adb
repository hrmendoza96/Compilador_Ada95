procedure Calc is
   Op: Character;               
   Disp: Integer := ;    -- ERROR: No asigna a nada     
   In_Val: Integer;             
begin
   loop
      -- Print the display.
      Put(Disp);

      -- Promt the user.
      Put("> ");

      -- Skip leading blanks and read the operation.
      loop
         Get(Op);
         exit when Op /= ' ';
      end loop -- ERROR: Falta el ;

      -- Stop when we're s'posed to.


      -- Read the integer value (skips leading blanks) and discard the
      -- remainder of the line.
      Get(In_Val);
      exit when Op = 'Q' or Op = 'q';
   end loop;
end Calc;