procedure Hello is 

   var: Integer := 4*5+2;

begin
   if 1>=2 or 3<4 then
      Put("Hola");
   else
      Put("Hola2");
   end if;

   if var>2 and 3<4 then
      Put("Hola3");
   else
      Put("Hola4");
   end if;

   while 3>2 or 5<7 loop
      get(var);
   end loop;

   loop
      Put("HolaLOOP");
      exit when 2>1;
   end loop;

   for i in 1 .. 5 loop
      Put("HolaFOR");
   end loop;

end Hello;

