package es.dokansoft.gdx.serp.view;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;

public class LoadingScreen extends SerpScreen {
	
	public AssetManager assets = new AssetManager();
	
	public LoadingScreen(Game game) {
		super(game);
		Gdx.app.log("LoadingScreen", "Constructor: job done!");
	}
	
	@Override
	public void render(float delta) {
		Gdx.app.log("LoadingScreen", "starting render()");
		
		game.setScreen(new MainMenuScreen(game));
		
		Gdx.app.log("LoadingScreen", "ended render()");
	}

	@Override
	public void resize(int width, int height) {
		Gdx.app.log("LoadingScreen", "resize()ing");
	}


	public void show(){
		Gdx.app.log("LoadingScreen", "show()ing");
		
		loadGameAssets();

		//Settings.load(game.getFileIO());
		Gdx.app.log("LoadingScreen", "finished show()ing");
	}
	
	public void loadGameAssets() {
		Assets.background = new Texture(Gdx.files.internal("background.png"));
		Assets.logo = new Texture(Gdx.files.internal("logo.png"));
		Assets.mainMenu = new Texture(Gdx.files.internal("mainmenu.png"));
		Assets.buttons = new Texture(Gdx.files.internal("buttons.png"));
		Assets.help1 = new Texture(Gdx.files.internal("help1.png"));
		Assets.help2 = new Texture(Gdx.files.internal("help2.png"));
		Assets.help3 = new Texture(Gdx.files.internal("help3.png"));
		Assets.numbers = new Texture(Gdx.files.internal("numbers.png"));
		Assets.ready = new Texture(Gdx.files.internal("ready.png"));
		Assets.pause = new Texture(Gdx.files.internal("pausemenu.png"));
		Assets.gameOver = new Texture(Gdx.files.internal("gameover.png"));
		Assets.headUp = new Texture(Gdx.files.internal("headup.png"));
		Assets.headLeft = new Texture(Gdx.files.internal("headleft.png"));
		Assets.headDown = new Texture(Gdx.files.internal("headdown.png"));
		Assets.headRight = new Texture(Gdx.files.internal("headright.png"));
		Assets.tail = new Texture(Gdx.files.internal("tail.png"));
		Assets.stain1 = new Texture(Gdx.files.internal("stain1.png"));
		Assets.stain2 = new Texture(Gdx.files.internal("stain2.png"));
		Assets.stain3 = new Texture(Gdx.files.internal("stain3.png"));
	    
		Assets.click = Gdx.audio.newSound(Gdx.files.internal("click.ogg"));
		Assets.eat = Gdx.audio.newSound(Gdx.files.internal("eat.ogg"));
		Assets.bitten = Gdx.audio.newSound(Gdx.files.internal("bitten.ogg"));
    }
	
	private void loadAssetManager() {
		// Using assets as an AssetManager
		Gdx.app.log("LoadingScreen", "starting loadGameAssets()");
		assets.load("background.png", Texture.class);
		assets.load("logo.png", Texture.class);
		assets.load("mainmenu.png", Texture.class);
		assets.load("buttons.png", Texture.class);
		assets.load("help1.png", Texture.class);
		assets.load("help2.png", Texture.class);
		assets.load("help3.png", Texture.class);
		assets.load("numbers.png", Texture.class);
		assets.load("ready.png", Texture.class);
		assets.load("pausemenu.png", Texture.class);
		assets.load("gameover.png", Texture.class);
		assets.load("headup.png", Texture.class);
		assets.load("headleft.png", Texture.class);
		assets.load("headdown.png", Texture.class);
		assets.load("headright.png", Texture.class);
		assets.load("tail.png", Texture.class);
		assets.load("stain1.png", Texture.class);
		assets.load("stain2.png", Texture.class);
		assets.load("stain3.png", Texture.class);

		assets.load("click.ogg", Sound.class);
		assets.load("eat.ogg", Sound.class);
		assets.load("bitten.ogg", Sound.class);
		Gdx.app.log("LoadingScreen", "ended loadGameAssets()");
	}

	@Override
	public void hide() {
		Gdx.app.log("LoadingScreen", "hide()ing");
	}

	@Override
	public void pause() {
		Gdx.app.log("LoadingScreen", "pause()ing");
	}

	@Override
	public void resume() {
		Gdx.app.log("LoadingScreen", "resume()ing");
	}

	@Override
	public void dispose() {
		Gdx.app.log("LoadingScreen", "dispose()ing");
		//assets.dispose();
	}

	@Override
	public void drawText(String line, int x, int y) {
		Gdx.app.log("LoadingScreen", "drawText()");
	}


}
