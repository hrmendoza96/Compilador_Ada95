procedure Proced is

   varPrimera, varSegunda, varTercera : Integer;
   varCuarta : Float;
   varQuinta : Boolean;

begin
   Write_A_Header();
   for Index in 1..7 loop
      Write_And_Increment();
      exit when Counter = 6;
   end loop;
   Write_An_Ending_Statement();
end Proced;

