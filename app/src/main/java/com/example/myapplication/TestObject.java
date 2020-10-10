package com.example.myapplication;

public class TestObject {

    String mName;
    int mPersonImageResourceId;
    int mRank;
    int mTotalPoints;


    public TestObject(String name, int personImageResourceId, int rank, int totalPoints) {

        mName = name;
        mPersonImageResourceId = personImageResourceId;
        mRank = rank;
        mTotalPoints = totalPoints;
    }

    public String getName() {
        return mName;
    }

    public int getPersonImageResourceId() {
        return mPersonImageResourceId;
    }

    public int getRank() {
        return mRank;
    }

    public int getTotalPoints() {
        return mTotalPoints;
    }
}
