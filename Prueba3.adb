--procedure Nombre is
  --A: Integer := 5;
  --function Factorial() return Integer is
  --begin
    --if A < 0 then                -- Stop recursion if A <= 0.
      --return 1;
    --elsif A = 0 then
      --return 1;
    --else
      --return A * Factorial(A - 1);   -- recurse.
    --end if;
  --end Factorial;
--end Nombre;

function Factorial () return Integer is
begin
  N: Integer := 5;
  A: Integer := 5;
  if N = 1 then
    return 1;
  else
    return N * Factorial (N - 1);
  end if;
end Factorial;