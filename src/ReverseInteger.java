/*
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 */

//we're working with 32 if its overloads then return 0, not more than 32

/*
example 1:
Input x = 123 =>chop of 3 out of 123 easily by %(moding) 10= 123%10 =3(reminder)

% decimal division
/ integer division => 123 /10= 12 =>12% 10= 2

3 * 10= 30 (shift 3 to prior place , so we can add 2 from above

output:321

 */


//hint= reversr all except the last value
//public class ReverseInteger {
//}
