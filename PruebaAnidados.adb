procedure Proced is

   Counter : INTEGER;

   procedure Write_A_Header() is
   begin
      Counter := 1;
      put("This is the heading for this little program.");
      
   end Write_A_Header;

   procedure Write_And_Increment() is
   begin
      put("This is line number");
      
      put(" of this program.");
      Counter := Counter + 1;
   end Write_And_Increment;

   procedure Write_An_Ending_Statement() is
   begin
      put("This is the end of this little program.");
   end Write_An_Ending_Statement;

begin
   Write_A_Header();
   for Index in 1..7 loop
      Write_And_Increment();
      exit when Counter = 6;
   end loop;
   Write_An_Ending_Statement();
end Proced;

