package Lecture_AbstractionsAndInterfaces.p09_MilitaryElite.interfaces;

import Lecture_AbstractionsAndInterfaces.p09_MilitaryElite.militaryInfo.Private;

import java.util.Set;

public interface ILeutenantGeneral extends IPrivate {
     Set<Private> getPrivates();
}
