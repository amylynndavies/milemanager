/**
 * My little app to test out OAuth with Java. 
 * Retrieves data from my dailymile account so I can do something fun with 
 * it later. Also my first time using GitHub for a project.
 *
 * OAuth/Dailymile details: http://www.dailymile.com/api/documentation/oauth
 * More OAuth: https://aaronparecki.com/articles/2012/07/29/1/oauth2-simplified  
 * And the RFC: http://tools.ietf.org/html/rfc6749 
 *
 * @author Amy Davies
 */

public class MileManager{

    private String str;

    public MileManager( String arg ){
        str = arg;
    }

    public static void main( String[] args ){
        
        MileManager myApp = new MileManager( "Hello World" );
        System.out.println( myApp.str );
    }
}
