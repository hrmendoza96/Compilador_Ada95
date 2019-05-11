procedure Nombre is
  A: Integer := 5;
  function Factorial() return Integer is
  begin
    if A < 0 then                -- Stop recursion if A <= 0.
      return 1;
    elsif A = 0 then
      return 1;
    else
      return A * Factorial(A - 1);   -- recurse.
    end if;
  end Factorial;
end Nombre;