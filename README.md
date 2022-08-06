# Development

# Description
The Simple Java Code demonstrates the how dynamic null checks can be done when using the Object equals() to compare mutable and immutable Java Objects.

# The Problem
If the Object equals() method is called by a mutable Object(a mutable Object is an Object whose value can be modified) 
to compare an immutable Object(an immutable Object is an Object whose value can not be modified),
a null error will be thrown if the mutable object is null.

# Solution
To solve the above, we can make sure the immutabale Object is the Object that calls the equals() method. in that case even if the mutable Object is null,
a null pointer exception will not be thrown.
