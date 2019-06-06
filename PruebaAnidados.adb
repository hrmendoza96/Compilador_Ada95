procedure Proced is

   Counter, varPrimera : INTEGER;

   procedure Write_A_Header() is
      varSegunda : integer;

      procedure Write_An_Ending_Statement() is
         varTercera:integer;

      begin
         put("This is the heading for this little program.");   
      end Write_An_Ending_Statement;

   begin
      put("This is the heading for this little program.");   
   end Write_A_Header;

   procedure Write_And_Increment() is
      varCuarta:integer;

   begin
      put("This is line number");
   end Write_And_Increment;


begin
   Write_A_Header();
   for Index in 1..7 loop
      Write_And_Increment();
      exit when Counter = 6;
   end loop;
   Write_An_Ending_Statement();
end Proced;