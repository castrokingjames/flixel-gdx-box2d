package org.flxbox2d.examples;

import org.flixel.FlxG;
import org.flxbox2d.collision.shapes.B2FlxBox;
import org.flxbox2d.dynamics.joints.B2FlxFrictionJoint;

/**
 *
 * @author Ka Wing Chin
 */
public class TestFrictionJoint extends Test
{
	@Override
	public void create()
	{		
		super.create();
		title.setText("FrictionJoint");
		info.setText("This is used for top-down friction.");
		
		B2FlxBox box = createBox(FlxG.width/2-25, FlxG.height/2-25, 50, 50);
		add(box);
		
		new B2FlxFrictionJoint(box, null)
			.setMaxForce(100)
			.setAnchorA(box.body.getWorldCenter())
			.create();
	}
}

