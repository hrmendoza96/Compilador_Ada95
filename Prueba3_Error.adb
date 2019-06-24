function Factorial(A : in Integer) return Integer is
begin
 if A < 0 then                
   return 1;
  end if;
 if A = 0 then
    return 1;
 else
   return A * Factorial( - A 1);   -- ERROR: El Opsuma (-) esta antes de los operandos
 end if;
end Sum;