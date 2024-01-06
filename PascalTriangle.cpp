#include <bits/stdc++.h>
using namespace std;

#define ll long long

// generate element at given pos
int nCr(int n, int r)
{
    int res = 1;
    for (int i = 0; i < r; i++)
    {
        res = res * (n - i);
        res = res / (i + 1);
    }
    return res;
}

// print nth row
void PrintRow(int n)
{
    vector<int> v;
    ll ans = 1;
    v.push_back(1);
    for (int i = 1; i < n; i++)
    {
        ans *= n - i;
        ans /= i;
        v.push_back(ans);
    }

    for (int i = 0; i < n; i++)
    {
        cout << v[i] << " ";
    }
}

// print triangle till nth row
int PascalTriangle(int n)
{
    for (int i = 0; i < n; i++)
    {
        PrintRow(i + 1);
        cout << endl;
    }
}

int main()
{
    int n;
    cin >> n;
    PascalTriangle(n);
}