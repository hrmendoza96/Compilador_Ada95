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

function Factorial (W, L, J, K: IN Integer; M: IN Boolean; X: IN String) return Integer is
  varPruebaFunction: Integer;
  function FactorialDOS () return Integer is
    procedure ProdAnidadoDOSCUATRO (T: IN Integer) is
      varPruebaFunctionPROCED: Integer;
      function FactorialTRES () return Integer is
      begin
          return 1;
      end FactorialTRES;
    begin
      Put("Texto del ANIDADO");
    end ProdAnidadoDOSCUATRO;
  begin
    NDOS: Integer := 5;
  end FactorialDOS;
begin
  N: Integer := 5;
  A: Integer := 5;
  if N = 1 then
    return 1;
  else
    return N * Factorial (N - 1);
  end if;
end Factorial;