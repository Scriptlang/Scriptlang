$cd ~;
for(ls_t & file : $ls -la) {
	string contents = $cat file.path;
	printf("File name: %s. Contents: %s\n", file.name, contents);
}

printf($cat $echo "text" >> file.txt);

$cat ($echo("text")) >> file.txt
$(cat $(echo "text")) >> file.txt


$ls -la

string contents = $cat $(ls ~ -la)[0].path;

string home = "~";
CmdObj arguments = $(-la);
string contents = $cat $(ls home arguments)[0].path;


import "@webrepository/http"; // Import http library from the online repository

HTTP server = new HTTP();

server.listen(80, new [string requestURL] { /* 'New' keyword makes the block run in its own thread */
	switch(requestURL) {
		@"home": server.send($(ls ~).toString()); /* Send the list of files of the home folder of current pc */
		
		cmd @ "root/runprogram1": { /* Run program at directory root */
			
			$cd /; /* First go to directory '/' */
			
			Object result = $( cmd[5:] ); // Now run the command by slicing the string. (Slice result would be: runprogram1)
			
			server.send(result.toString()); // Send program's response back
		},

		@"close": server.close(); /* Closes the server, and thus, the program */
	}
});

/* Wait until the server closes */
server.wait();
