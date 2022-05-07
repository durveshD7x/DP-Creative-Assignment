class MobileGameStore extends GameStore
{
Game g;
Game searchgame(String name)
{  
if(name.equalsIgnoreCase("Genshin Impact"))
{
g = new GenshinImpact();
}
if(name.equalsIgnoreCase("Pubg Mobile"))
{
g = new PubgMobile();
}
if(name.equalsIgnoreCase("Subway Surfers"))
{
g = new SubwaySurfers();
}
return (g);
}
}
