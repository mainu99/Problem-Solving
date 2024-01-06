#include <bits/stdc++.h>
using namespace std;

class Solution
{
    void resPermute(vector<int> &a, vector<vector<int>> &ans, vector<int> &v, vector<int> &freq)
    { // O(n!*n) O(n+n)
        if (v.size() == a.size())
        {
            ans.push_back(v);
            return;
        }

        for (int i = 0; i < a.size(); i++)
        {
            if (!freq[i])
            {
                v.push_back(a[i]);
                freq[i] = 1;
                resPermute(a, ans, v, freq);
                freq[i] = 0;
                v.pop_back();
            }
        }
    }

    void resPermute(vector<int> &a, vector<vector<int>> &ans, int idx)
    { // O(n!*n) O(1)
        if (idx == a.size())
        {
            ans.push_back(a);
            return;
        }
        for (int i = idx; i < a.size(); i++)
        {
            swap(a[idx], a[i]);
            resPermute(a, ans, idx + 1);
            swap(a[idx], a[i]);
        }
    }

public:
    vector<vector<int>> permute(vector<int> &nums)
    {
        // vector<vector<int>> ans;
        // vector<int> v;
        // vector<int> freq(nums.size(), 0);
        // resPermute(nums, ans, v, freq);
        // return ans;
        vector<vector<int>> ans;
        resPermute(nums, ans, 0);
        return ans;
    }
};