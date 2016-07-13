#!/usr/bin/perl
$n=<>;
$f= 0;
$s = 1; 
for ( $i = 0 ; $i < $n ; $i++ )
{
if($i<= 1 )
{
$next=$i;
}
else
{
$next = $f + $s;
$f = $s;
$s = $next;
}
print(" the fibonacci series:$next 
");
}
