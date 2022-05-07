class Demo
{
public static void main(String args[])
{
GameStore gs;
gs = new MobileGameStore();
gs.downloadgame("Genshin Impact");
gs.downloadgame("Pubg Mobile");
gs.downloadgame("Subway Surfers");

gs = new PcGameStore();
gs.downloadgame("Jump Force");
gs.downloadgame("Valorant");
gs.downloadgame("WWE 2K16");
}
}

