abstract class Game
{
String name;
String category;
String rating;
abstract void list();

void search()
{
System.out.println("Search the Game");
}
void install()
{
System.out.println("Installing...");
}
void start()
{
System.out.println("Start the Game");
}
public void play()
{
System.out.println("The Game is : "+ name + "\nCategory : " + category + "\nRating: " + rating);
}
}