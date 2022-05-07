abstract class GameStore
{
Game p;
public void downloadgame(String name)
{
p = searchgame(name);
p.search();
p.install();
p.start();
p.play();
}
abstract Game searchgame(String name);
}