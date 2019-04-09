procedure Calc is
   Op: Character;               
   Disp: Integer := ;    -- ERROR: No asigna a nada     
   In_Val: Integer;             
begin
   loop
      
      Put_Line(Disp);

      
      Put_Line("> ");

      
      loop
         Get(Op);
         exit when Op /= ' ';
      end loop -- ERROR: Falta el ;

      


      
      Get(In_Val);
      exit when Op = 'Q' or Op = 'q';
   end loop;
end Calc;