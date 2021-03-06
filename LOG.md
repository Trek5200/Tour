# Development Notebook

## 5/11/2020 - Update

Stories worked on:<br>
* List MySQL database contents on User page<br>
  -- works<br>
* Get map to show on new map page<br>
  -- works, centered on KC with center marker<br>
* Researched how to put postal addresses on google map<br>
  -- seems the only way is to use latitude and longitude<br>
  -- will likely need to either hard code lat/lng into database, or figure out how to grab from address on the fly<br>

Code decisions:<br>
* Opted to work on learning about maps and markers instead of adding features table<br>
* Also left Spring security in parking lot until after figuring out map markers
* CRITICAL ERROR: Made security error when I uploaded my google API key to github<br>
  -- unable to delete key from github<br>
  -- did in my sandbox repo, so I just made it private and regenerated a new key<br>

Plans moving forward:<br>
* Figure out how to secure map API key while keeping it usable and not uploading the API key to github<br>
* Update wire diagrams<br>

Parking Lot:<br>
* Add features table after getting addresses in db to display on map and after implementing down select tables
* Update sign in to include Spring Boot security registration<br>


## 5/4/2020 - Update

Stories worked on:<br>
* As an Admin, enter site data into MySQL database<br>
* Able to setup site table: site.java is working<br>
* Able to display input forms, post data to MySQL, return to form after form entry is posted.<br>
* Successfully added Bootstrap back into project.<br>

Code decisions:<br>
* Spent a lot of time debugging; probably tried to code too much at once.<br>
* Reduced database to single table for now; will add features table after getting map to work with markers for site locations.<br>

Plans moving forward:<br>
* List MySQL database contents in table on User page<br>
* Get maps to show and center on Kansas City<br>
* Review java syntax for live coding exercises<br>
* Update wire diagrams<br>

Parking Lot:<br>
* Add features table after getting addresses in db to display on map and after implementing down select tables
* Update sign in to include Spring Boot security registration


## 4/27/2020 - Update

Transistioned to individual project 4/22/2020<br>
* Updated https://github.com/Trek5200/liftoff-assignmentsto reflect my transition to an individual assignment.<br>
C1, P1, P2, and P3 were updated as needed.

Stories worked on:<br>
* Added simple landing page<br>
* Added and made changes to login to include "roles" as a USER and ADMIN<br>
* Spring Security a bit challenging, so I left the login as hard coded User and Admin users and passwords for now.<br>
* Had to overcome a persistent loading of Bootstrap from the cloud that would not load the html pages correctly.<br>
* I was able to demonstrate the code in another project and it worked fine, but not in the tour project (which was identical)<br>
* Got around that issue by reseting to the master branch, then recoding as a new branch, verifying it worked, then pushing the login branch to to github.<br>
* Spent time going over Bootstrap again so I can implement going forward

Code decisions:<br>
* Thought I would use Spring Security for "simple" login and registration. Seemed like a good way to assign roles with permission levels.<br>
* Given difficulty of getting Spring Sercurity to work, I am opting to not include a user registration at this time. I'll leave User and Admin hard coded until I can return to fix this.<br>
* Decided to add Admin role to use for data input<br>

Plans moving forward:<br>
* Setup tour schema in MySQL<br>
* Write code to enter data in db<br>
* Evaluate and maybe add Bootstrap for formatting<br>
* Update wire diagrams<br>


## 4/20/2020 - Update

* Dropped myself from Water Garden Tour team to pursue individual project<br>
* Will pursue similar project but just call it Tour with fewer features since it is just me working on it

