
function fetchBookCaseInfo( bookcaseId: string )
{
    fetch( "/api/bookcase", {
        method: "GET",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify( bookcaseId )
    } )
        .then( response =>
        {
            if ( !response.ok )
            {
                throw new Error( "Network response was not ok" );
            }
            return response.text();
        } )
        .then( data =>
        {
            // TODO handle receiving data
            console.log( data );
        } )
        .catch( error =>
        {
            console.error( "There was a problem with the fetch operation:", error );
        } );
}
