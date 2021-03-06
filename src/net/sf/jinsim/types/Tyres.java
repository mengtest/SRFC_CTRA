/* ***** BEGIN LICENSE BLOCK *****
 * Version: MPL 1.1/GPL 2.0/LGPL 2.1
 *
 * The contents of this file are subject to the Mozilla Public License Version
 * 1.1 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the
 * License.
 *
 * The Original Code is the JInSim Library.
 *
 * The Initial Developer of the Original Code is Rob Heiser.
 *
 * Portions created by the Initial Developer are Copyright (C) 2006
 * the Initial Developer. All Rights Reserved.
 *
 * Contributor(s):
 *
 *   Rob Heiser <jinsim@kerf.org>
 *
 * Alternatively, the contents of this file may be used under the terms of
 * either the GNU General Public License Version 2 or later (the "GPL"), or
 * the GNU Lesser General Public License Version 2.1 or later (the "LGPL"),
 * in which case the provisions of the GPL or the LGPL are applicable instead
 * of those above. If you wish to allow use of your version of this file only
 * under the terms of either the GPL or the LGPL, and not to allow others to
 * use your version of this file under the terms of the MPL, indicate your
 * decision by deleting the provisions above and replace them with the notice
 * and other provisions required by the GPL or the LGPL. If you do not delete
 * the provisions above, a recipient may use your version of this file under
 * the terms of any one of the MPL, the GPL or the LGPL.
 *
 * ***** END LICENSE BLOCK ***** */
package net.sf.jinsim.types;

import java.nio.ByteBuffer;

public class Tyres {

	public static final byte TYRE_R1 = 0;

	public static final byte TYRE_R2 = 1;

	public static final byte TYRE_R3 = 2;

	public static final byte TYRE_R4 = 3;

	public static final byte TYRE_ROAD_SUPER = 4;

	public static final byte TYRE_ROAD_NORMAL = 5;

	public static final byte TYRE_HYBRID = 6;

	public static final byte TYRE_KNOBBLY = 7;

	public static final byte NOT_CHANGED = (byte)0xff;

	private byte rearLeft;

	private byte rearRight;

	private byte frontLeft;

	private byte frontRight;

	public Tyres() {
	}
	
	public Tyres(byte rearLeft, byte rearRight, byte frontLeft, byte frontRight) {
		this.rearLeft = rearLeft;
		this.rearRight = rearRight;
		this.frontLeft = frontLeft;
		this.frontRight = frontRight;
	}


	public Tyres(ByteBuffer buffer) {
		rearLeft = buffer.get();
		rearRight = buffer.get();
		frontLeft = buffer.get();
		frontRight = buffer.get();
	}

	public byte getFrontLeft() {
		return frontLeft;
	}

	public void setFrontLeft(byte tyreFrontLeft) {
		this.frontLeft = tyreFrontLeft;
	}

	public byte getFrontRight() {
		return frontRight;
	}

	public void setFrontRight(byte tyreFrontRight) {
		this.frontRight = tyreFrontRight;
	}

	public byte getRearLeft() {
		return rearLeft;
	}

	public void setRearLeft(byte tyreRearLeft) {
		this.rearLeft = tyreRearLeft;
	}

	public byte getRearRight() {
		return rearRight;
	}

	public void setRearRight(byte tyreRearRight) {
		this.rearRight = tyreRearRight;
	}

	public String toString() {
		return "Tyres [rearLeft=" + rearLeft + ", rearRight=" + rearRight
				+ ", frontLeft=" + frontLeft + ", frontRight=" + frontRight
				+ "]";
	}

}
