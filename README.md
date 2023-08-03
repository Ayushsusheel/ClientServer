# ClientServer
Using the TCP protocol the 2 users can communicate between themselves .
Developed a chat application that works in unidirectional way within
an area.
Tech used – Java, Socket Programming

So, In this project I have created 2 separate classes Client & Server.java

* 1st compile the code for the client side (i.e javac client.java) then same for the server side code (javac server.java)
* On the server command prompt run the command :- java server then run the command for client :- java client in order to see the text as CLIENT Connected... on the server side.
* The client has to now input his/her name after hitting enter a text appears as WELCOME (user input name) to ANONYMOUS SERVER.... now the client is able to send the messgae to server.
* Now the client can type anything for example :- Hello I'm ABC after hitting enter this message will be displayed on the server side cmd window
* Now on the server side the server can send any response to the client (or it can be used as a communication application).
* Notice !!!!!!
* This follows the TCP protocol concpet means it is unidirectional (means if A has typed some message and after hitting enter the message is displayed on the B side now when B doesn't type anything A cant message again. After the B message has been sent then only the communication will occur. One response at a  time. )
* Now in order to stop the communication the Server has to type stop(we can change it in code) then only the code execution will stop else it will continue.
* If the client is typing stop it will be considered as a normal message only on the server side.
