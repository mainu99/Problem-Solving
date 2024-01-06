#include <bits/stdc++.h>
using namespace std;

class Solution // O(N)    O(N)
{
public:
    vector<vector<int>> findMatrix(vector<int> &nums)
    {
        vector<int> freq(nums.size() + 1, 0);
        vector<vector<int>> ans;
        for (int x : nums)
        {
            if (freq[x] >= ans.size())
            {
                ans.push_back({});
            } // we need a new row

            ans[freq[x]].push_back(x);
            freq[x]++;
        }

        return ans;
    }
};

int main()
{
    vector<int> a = {4, 4, 6, 1, 1, 9, 10, 10, 10, 6};
    int n = a.size();
    Solution s1;
    vector<vector<int>> mat = s1.findMatrix(a);
    for (int i = 0; i < mat.size(); i++)
    {
        for (int j = 0; j < mat[i].size(); j++)
        {
            cout << mat[i][j] << " ";
        }
        cout << endl;
    }
    return 0;
}