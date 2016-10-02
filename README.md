# UBAND-Score-Keeper
Udacity Android Basics Nanodegree-Score Keeper


PROJECT SPECIFICATION
Score Keeper

Layout

      • Game Chosen
		  o The chosen game has either multiple amounts of points that can be scored, 
			as in american football, or multiple important metrics to track, such as 
			fouls, outs, and innings in baseball.
      
	  • Overall layout
		  o App is divided into two columns, one for each team.
			
      • Column contents
          o Each column contains a large TextView to keep track of the current score for that team.
          o	Optionally, a second TextView to track another important metric such as fouls can be added.
	  
	  • Score buttons
          o Each column contains multiple buttons. The buttons must track either:
			Each track a different kind of scoring
			Or
			Each track a different metric (one score, the other fouls, for instance).
	
	  • Reset button
          o The layout contains a ‘reset’ button.
		  
	  • Best practices
		    The code adheres to all of the following best practices:
				o Text sizes are defined in sp
				o Lengths are defined in dp
				o Padding and margin is used appropriately, such that 
				  the views are not crammed up against each other."
          

Functionality

    • Errors
          o The code runs without errors.
    • Score Button Function
          o Each score button updates the score TextView in its column by 
			adding the correct number of points.
    • Reset Button Function
		  o The reset button resets the scores on both of the score TextViews.

Code Readability

    • Naming conventions	
          o Any classes are named after the object they represent.
          o All variables are named by their intended contents.
          o All methods are named by their intended effect or in 
			the style required by a callback interface.
    • Code style
          o There are no unnecessary blank lines.
          o One variable is declared per declaration line.
          o The code within a method is indented with respect 
			to the method declaration line.
