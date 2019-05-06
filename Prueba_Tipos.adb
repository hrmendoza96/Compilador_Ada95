procedure Calc is
    a : constant String := "hola"; 
    b :  String := "Adios"; 
    
    c : constant Integer := 10;
    d : Integer := 11;
    
    e : constant Boolean := true;   
    f :  Boolean := false;

    g : constant Boolean := false;   
    h :  Boolean := true; 
     
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
      end loop;

      -- Stop when we're s'posed to.


      -- Read the integer value (skips leading blanks) and discard the
      -- remainder of the line.
      Get(In_Val);
      exit when Op = 'Q' or Op = 'q';
   end loop;
end Calc;