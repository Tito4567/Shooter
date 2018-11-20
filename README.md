# Shooter
Simple shooter
Two ships on a blank background that will shoot at each
other. Each will be controlled over the internet. 

3/31/18
Tonight I went over the files to recall how everything worked. 
The second ship has to be recoded so that it can respawn on the opposite
side of the screen when going through the top, bottom, left, or right. 
Collsion detection is still necessary. Shooting is still necessary for both ships

I still have to implement the threads to allow the ships to behave on their 
own respective threads as opposed to both working off the main thread. 

I will be using UDP to control threads over the internet. 


8/25/18
Last night I added an api that will allow me to use my Xbox 360 controller.
There have been several other changes that has happened through the months.
I still have to implement the RMI (Remote Method Invocation) to allow players
to compete online. I don't think multithreading is necessary. Once I have 
more than one player going, I will be able to see.


11/17/18
Uploaded files from updates that were made on
8/25/18. I have a few ideas for the keyboard or
controller option. 

11/18/18
I started making a Bootstrapper file to as a starting point
to get the game going. I just uploaded the new files and modifications.

11/20/18
Still working with the Bootstrapper, I think I'm going to have to rewrite
the code to start at the Bootstrapper and pass desired start code to the 
Shooter1 class. 
