procedure Hello is   
   var: Integer := 1;
   siguiente: Integer;
   i:Integer:=1;
begin
   siguiente := 10;
   if var = 1 then
      put("Hola Mundo.");
   end if;

   var := 0;
   put("n");
   if var <= 0 then
      put("Es menor igual que cero");
   end if;

   var := 10;
   put("n");
   if var >= 0 and var < 11 then
      put("Es mayor igual que cero y menor que once.");
   end if;

   var := 0;
   put("n");
   if var < 10 then
      put("Es menor que diez");
   end if;
   
   put("n");
   var := 0;
   if var > 1 then
      put("Es mayor que 1");
   else 
      put("No es mayor que 1");
   end if;
   put("n");
   
   var := 1;
   while var<10 loop

      put("Hola");
      if var = 1 then
         put("Es igual que 1");
         var := 2;
         put("n");
      end if;
      if var = 2 then
         put("Es igual a 2");
         var := 3;
         put("n");
      end if;
      if var = 3 then
         put("Es igual que 3");
         var := 4;
         put("n");
      end if;
      if var = 4 then
         put("Es igual a 4");
         var := 5;
         put("n");
      end if;
      if var = 5 then
         put("Es igual que 5");
         var := 6;
         put("n");
      end if;
      if var = 6 then
         put("Es igual a 6");
         var := 7;
         put("n");
      end if;
      if var = 7 then
         put("Es igual que 7");
         var := 8;
         put("n");
      end if;
      if var = 8 then
         put("Es igual a 8");
         put("n");
         var := 9;
      end if;
      if var = 9 then
         put("Es igual a 9");
         put("n");
         var := 10;
      end if;


   end loop;

end Hello;

