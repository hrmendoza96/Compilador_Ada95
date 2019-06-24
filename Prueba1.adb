procedure Hello is   
   varPR: Integer;
   siguiente: Integer;
   booleano : Boolean; --se considera falso
begin
   siguiente:= 111;
   varPR := 10 - 1;
   varPR := 5 * 10;
   siguiente:=10;
   booleano := FALSE;
   if varPR > 1 then
      put("ger menor");
      put(booleano);
      get(varPR);
      get(booleano);
   end if;
   if varPR < 2 then
      put("ger mayor");
   end if;
end Hello;

