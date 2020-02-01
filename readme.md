## n+1 query problem

This spring project illustrates the n+1 query problem and how to fix it.

You can go through the commits to understand the problem and the solution.

To run the application and look at the sql logs, run :

`./mvnw spring-boot:run`

In the latest commit you'd see only one select query to fetch all data.

If you checkout previous commits, you'd see multiple select queries to
fetch the same data.
