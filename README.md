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
Done


#### 6) Implement communication between layers ####
Done

#### 7) Format data ####
Done


#### 8) Improve UI ####
Done


#### 9) Writing tests for layers and util classes ####
Backlog


## Used libraries ##
* **Support Libraries**
* **CircleImageView** ([link](https://github.com/hdodenhof/CircleImageView)) To show profile images on ListActivity;
* **Simple-RecyclerView** ([link](https://github.com/luisfernandezbr/simple-recyclerview)) A library that I develop to prevent RecyclerView boilerplate code 
    * **Support RecyclerView**
    * **Glide Image Loader** ([link](https://github.com/bumptech/glide)) To load images magically 
* **MVPLibrary** - A group of classes used to write my WIP version of MVP 
    * **EventBus** ([link](https://github.com/greenrobot/EventBus)) To provide event based communication between MVP layers
    * **Gson** ([link](https://github.com/google/gson)) To provide event based communication between MVP layers

## Mapped Backlog ##
* Tests
    * I really don't use TDD today, even knowing your value
    * Even so, the project was developed separating layers in testable pieces;
* DetailsActivity in MVP architecture
    * I developed only the ListActivity using a decoupled architecture
* Error handling
* Content loading feedback