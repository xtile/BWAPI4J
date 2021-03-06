////////////////////////////////////////////////////////////////////////////////
//
//    Copyright (C) 2017-2018 OpenBW Team
//
//    This file is part of BWAPI4J.
//
//    BWAPI4J is free software: you can redistribute it and/or modify
//    it under the terms of the Lesser GNU General Public License as published 
//    by the Free Software Foundation, version 3 only.
//
//    BWAPI4J is distributed in the hope that it will be useful,
//    but WITHOUT ANY WARRANTY; without even the implied warranty of
//    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//    GNU General Public License for more details.
//
//    You should have received a copy of the GNU General Public License
//    along with BWAPI4J.  If not, see <http://www.gnu.org/licenses/>.
//
////////////////////////////////////////////////////////////////////////////////

/*
 * Bridge.h
 *
 *  Created on: Jul 16, 2017
 *      Author: imp
 */
#include <jni.h>

#ifndef BRIDGE_H_
#define BRIDGE_H_

extern JNIEnv * globalEnv;
extern jobject globalBW;
extern jint intBuf[];


extern jclass arrayListClass;
extern jmethodID arrayListAdd;

extern jclass integerClass;
extern jmethodID integerNew;

extern jclass tilePositionClass;
extern jmethodID tilePositionNew;

extern jclass weaponTypeClass;
extern jclass techTypeClass;
extern jclass unitTypeClass;
extern jclass upgradeTypeClass;
extern jclass damageTypeClass ;
extern jclass explosionTypeClass;
extern jclass raceClass;
extern jclass unitSizeTypeClass;
extern jclass orderClass;

extern jclass pairClass;
extern jmethodID pairNew;

extern jclass bwMapClass;
extern jmethodID bwMapNew;

extern jmethodID addRequiredUnit;
extern jmethodID addUsingUnit;


#endif /* SO_H_ */
