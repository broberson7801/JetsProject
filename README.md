# Jets PRoject
## Second -Week Graded Project
### Bryan Roberson, Skill Distillery student


RUNNING THE PROGRAM:

Everything in the program is self explanatory. The program has plenty of prompts and
"idiot proofing" for when an invalid choice on any menu is made. There is no idiot
proofing for entering an invalid entry into a field (e.g. entering "dave" for the speed of the jet you are adding to the array). Additionally there is no idiot proofing for when a too big a number is added to the any of the fields(e.g. entering
a number larger than a double into the "range" field when adding a jet);

The program will save the array, show any updated information for when a pilot is added, or when a jet is added, so long as the program does not crash (see above), or so long as a "QUIT" option is not chosen on any of the menu items. 


As for the stretch goals, I did not randomize the pilots, otherwise, you can add a pilot, though no option is included in the program to list them separately apart from the jets.

ISSUES IN WRITING THE PROGRAM:

For some reason, I decided to have an ICBM in the hangar, and I attempted to to write a for loop stating that there isn't a pilot for the missile (It didn't work), so if you add a pilot, the pilot will be suicidal and fly the ICBM.

The biggest challenge on the project was getting an initialized jet array out of the method (ultimately set the array to a field -took a day plus help from Aaron), and after i got the array out, everything else was simple, minus a few hiccups here and there. 


When looking through the code, you'll a printJet() method, and that will show just the jets in the array and NOT the null spaces beneath it. I was initially using the printJet method until I decided to go after the stretch goals for the project. 
