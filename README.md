<h1 align="center"> Tech Talent Twitter </h1>
<h3 align="center"> Tech Talent & Strategy (i.e. Tech Talent South) </h3>
<h5 align="center"> Project Assignment 1 - <a href="https://www.concordia.ca/">Concordia University</a> (Winter 2020) </h5>

<p align="center"> 
  <img src="gif/pacman_game.gif" alt="Animated gif pacman game" height="282px" width="637">
</p>

<!-- TABLE OF CONTENTS -->
<h2 id="table-of-contents"> :book: Table of Contents</h2>

<details open="open">
  <summary>Table of Contents</summary>
  <ol>
    <li><a href="#about-the-project"> ➤ About The Project</a></li>
    <li><a href="#overview"> ➤ Overview</a></li>
    <li><a href="#project-files-description"> ➤ Project Files Description</a></li>
    <li><a href="#getting-started"> ➤ Getting Started</a></li>
    <li><a href="#references"> ➤ References</a></li>
    <li><a href="#credits"> ➤ Credits</a></li>
  </ol>
</details>

![-----------------------------------------------------](https://raw.githubusercontent.com/andreasbm/readme/master/assets/lines/rainbow.png)

<!-- ABOUT THE PROJECT -->
<h2 id="about-the-project"> :pencil: About The Project</h2>

<p align="justify"> 
  For those of you not familiar with Pacman, it's a game where Pacman (the yellow circle with a mouth in the above figure) moves around in a maze and tries to eat as many food pellets (the small white dots) as possible, while avoiding the ghosts (the other two agents with eyes in the above figure). If Pacman eats all the food in a maze, it wins.
</p>

![-----------------------------------------------------](https://raw.githubusercontent.com/andreasbm/readme/master/assets/lines/rainbow.png)

<!-- OVERVIEW -->
<h2 id="overview"> :cloud: Overview</h2>

<p align="justify"> 
  In this project, the Pacman agent will find paths through his maze world, both to reach a particular location and to collect food efficiently. I implemented general search algorithms such as depth-first, breadth-first, uniform cost, and A* search algorithms which are used to solve navigation problems in the Pacman world.
</p>

![-----------------------------------------------------](https://raw.githubusercontent.com/andreasbm/readme/master/assets/lines/rainbow.png)

<!-- PROJECT FILES DESCRIPTION -->
<h2 id="project-files-description"> :floppy_disk: Project Files Description</h2>

<ul>
  <li><b>search.py</b> - Where all of the search algorithms reside.</li>
  <li><b>searchAgents.py</b> - Where all of the search-based agents reside.</li>
  <li><b>pacman.py</b> - The main file that runs Pacman games. This file also describes a Pacman GameState types.</li>
  <li><b>game.py</b> - The logic behind how the Pacman world works.</li>
  <li><b>util.py</b> - Useful data structures for implementing search algorithms.</li>
</ul>

<h3>Some other supporting files</h3>
<ul>
  <li><b>graphicsDisplay.py</b> - Graphics for Pacman.</li>
  <li><b>graphicsUtils.py</b> - Support for Pacman graphics.</li>
  <li><b>textDisplay.py</b> - ASCII graphics for Pacman.</li>
  <li><b>ghostAgents.py</b> - Agents to control ghosts.</li>
  <li><b>keyboardAgents.py</b> - Keyboard interfaces to control Pacman.</li>
  <li><b>layout.py</b> - Code for reading layout files and storing their contents.</li>
  <li><b>autograder.py</b> - Project autograder.</li>
  <li><b>testParser.py</b> - Parses autograder test and solution files.</li>
  <li><b>testClasses.py</b> - General autograding test classes.</li>
  <li><b>test_cases/</b> - Directory containing the test cases for each scenario.</li>
  <li><b>searchTestClasses.py</b> - Project specific autograding test classes.</li>
</ul>

![-----------------------------------------------------](https://raw.githubusercontent.com/andreasbm/readme/master/assets/lines/rainbow.png)

<!-- GETTING STARTED -->
<h2 id="getting-started"> :book: Getting Started</h2>

<p>You are able to start the game by typing the following commands in the command line:</p>
<pre><code>$ python pacman.py</code></pre>

<p>You can see the list of all options and their default values via:</p>
<pre><code>$ python pacman.py -h</code></pre>
<i>Note that all of the commands that appear in this project also appear in <code>commands.txt</code>, for easy copying and pasting.</i>

![-----------------------------------------------------](https://raw.githubusercontent.com/andreasbm/readme/master/assets/lines/rainbow.png)

<!-- CREDITS -->
<h2 id="credits"> :scroll: Credits</h2>

Acknowledgements: Based on Mohammad Amin Shamshiri's README on <a href=https://github.com/ma-shamshiri/Pacman-Game#readme>github.com/ma-shamshiri/Pacman-Game#readme</a>


