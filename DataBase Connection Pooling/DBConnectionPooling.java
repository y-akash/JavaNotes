/*
Connection pooling is a well-known data access pattern.

If we required to communicate with database multiple times then it is not recommended to create separate Connection 
object every time, b'z creating and destroying Connection object every time creates performance problems. 

To overcome this problem, we should go for Connection Pool. 
Connection Pool is a pool of already created Connection objects which are ready to use. 

If we want to communicate with database then we request Connection pool to provide Connection. 
Once we got the Connection, by using that we can communicates with database. 
After completing our work, we can return Connection to the pool instead of destroying. 

Hence the main advantage of Connection Pool is we can reuse same Connection object multiple times, 
so that overall performance of application will be improved,
*/