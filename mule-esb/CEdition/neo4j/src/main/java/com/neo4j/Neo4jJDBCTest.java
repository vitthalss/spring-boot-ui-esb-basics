

package com.neo4j;


import java.util.logging.Logger;

import org.neo4j.driver.v1.AuthTokens;
import org.neo4j.driver.v1.Driver;
import org.neo4j.driver.v1.GraphDatabase;
import org.neo4j.driver.v1.Record;
import org.neo4j.driver.v1.Session;
import org.neo4j.driver.v1.StatementResult;

public class Neo4jJDBCTest
{
	private static final Logger logger = Logger.getLogger("com.neo4j.Neo4jJDBCTest");
    /**
     *  Driver objects are thread-safe and are typically made available application-wide.
     */
    Driver driver;

    public Neo4jJDBCTest(String uri, String user, String password)
    {
        driver = GraphDatabase.driver(uri, AuthTokens.basic(user, password));
        logger.info("driver:::::::::::::::::::::"+driver);
    }

  

    private void printPeople(String initial)
    {
        try (Session session = driver.session())
        {
            /**
             *  Auto-commit transactions are a quick and easy way to wrap a read.
             */
        	 StatementResult result = session.run(
                     "MERGE (n:Employee {name: 'Lokesh'}) RETURN n");
            /**
             *  Each Cypher execution returns a stream of records.
             */
            while (result.hasNext())
            {
                Record record = result.next();
                /**
                 *  Values can be extracted from a record by index or name.
                 */
                logger.info("json:::"+record.get("n").asMap());
                logger.info("name:::"+record.get("n").asMap().get("name"));
                logger.info("id:::"+record.get("n").asMap().get("id"));
                logger.info("deptno:::"+record.get("n").asMap().get("deptno"));
                logger.info("sal:::"+record.get("n").asMap().get("sal"));
            }
        }
    }

    public void close()
    {
        /**
         *  Closing a driver immediately shuts down all open connections.
         */
        driver.close();
    }

    public static void main(String... args)
    {
        Neo4jJDBCTest neo4jJDBCTest = new Neo4jJDBCTest("bolt://localhost:7687/db/data", "neo4j", "neo4j@123");
        
        neo4jJDBCTest.printPeople("A");
        neo4jJDBCTest.close();
    }
    
    
}
