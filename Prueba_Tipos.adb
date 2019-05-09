procedure Calc is
      a : constant String := "hola"; 
      b :  String := "Adios"; 
    
      c : constant Integer := 10 / 2;
      d : Integer := 11;
    
      e : constant Boolean := true;   
      f :  Boolean := false;

      g : constant Boolean := false;   
      h :  Boolean := true; 

      i : Integer;
      --a : Integer;

      --g : Integer := 4;
      --f : Integer := true;
      d := 12.5; 
      


     
begin
  loop
      -- Print the display.
      Put(Disp);

      -- Promt the user.
      Put("> ");

      -- Skip leading blanks and read the operation.
      loop
         Get(Op);
         exit when Op /= 10;
      end loop;

      -- Stop when we're s'posed to.


      -- Read the integer value (skips leading blanks) and discard the
      -- remainder of the line.
      Get(In_Val);
      exit when Op = 11 or Op = 12;
   end loop;
end Calc;