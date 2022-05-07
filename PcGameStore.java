class PcGameStore extends GameStore
{
Game g;
Game searchgame(String name)
{  
if(name.equalsIgnoreCase("Jump Force"))
{
g = new JumpForce();
}
if(name.equalsIgnoreCase("Valorant"))
{
g = new Valorant();
}
if(name.equalsIgnoreCase("WWE 2K16"))
{
g = new Wwe2k16();
}
return (g);
}
}
