class RecentCounter:

    def __init__(self):
        self.counter = 0
        self.requests = []

    def ping(self, t: int) -> int:
        self.requests.append(t)
        cnt, num = 0, -1
        for i in range(len(self.requests)):
            if t - 3000 <= self.requests[i] <= t:
                cnt += 1
            else:
                num += 1
        if num != -1:
            del self.requests[:num]
        return cnt
        #return sum(1 for i in range(len(self.requests)) if t - 3000 <= self.requests[i] <= t else del self.requests[i] )


# Your RecentCounter object will be instantiated and called as such:
# obj = RecentCounter()
# param_1 = obj.ping(t)