## What is this repository for? ##

* Private repo to develop 99 code challenge
* Challenge description: https://goo.gl/zKDz0G

## Project Planning ##

#### 1) Understand json data and structure ####
* Images don't have same sizes
* One of images has a broken link
* One entry don't have the "bio" attribute
* Dates are in ISO8601 format

#### 2) Prototype app screens ####
List Screen Proposal

![list.jpg](https://bitbucket.org/repo/Bggdzxn/images/1886852523-list.jpg =100x20 "Screen proposal")


Inspired by Material Design Guidelines (https://material.io/guidelines/components/lists.html#lists-specs)


Details Screen Proposal

![details.jpg](https://bitbucket.org/repo/Bggdzxn/images/1467426949-details.jpg)

Inspired by Material Design Guidelines (https://material.io/guidelines/)
Other inspirations:
* https://goo.gl/pxg1uY
* https://goo.gl/WVpBBX


#### 3) Define code architecture ####
**M**odel  **V**iew  **P**resenter + Data Access

![architecture_diagram.jpg](https://bitbucket.org/repo/Bggdzxn/images/3527184124-architecture_diagram.jpg)


#### 4) Choose what libraries to use ####
* **Simple-RecyclerView** - To simplify list content.
* **EventBus** - To enable layers communication by events. RXJava alternatively.



#### 5) Write layer classes and define communication methods ####
#### 6) Start writing tests for layers and util classes ####
#### 7) Implement communication between layers ####
#### 8) Format data ####
#### 9) Improve UI ####