procedure Hello is   
   varPR: Float := 2.5 + 2.5 - 3 / 3 * 2 + 1;
begin
   Put("Hello, World!");  
   while varPR /= 1 loop
      if varPR >= 420 then
         Put("Hola");
      end if;
   end loop;
end Hello;

