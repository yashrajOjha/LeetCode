### [Question Link](https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/description/)

`points = [[10,16],[2,8],[1,6],[7,12]]`

We will first sort the arrays to know which intervals can potentially overlap.

<img src="https://lh3.googleusercontent.com/pc_GP34p8iTcpFQbUkdjPcNs-Ex3-KxOxryQVwmEFbuRrQFt4F2bdO0oV2Rn266QVcNaHFEdM2UXoXVi-lpXlvEnBQxMMd-KF6pAkJN6Cbi_joC5xc5bSiQ0ijE0K8Cc_F1ZCZQPe9zg_WKu-2NTvf59u30ed-6-7ARGfXnrtauw58zCU7kCHzOYMjvGjI7MyZRsQe2ILApuk44_vGeCZiEl8aZwc-NMMpyJZ4G55bqaoKcpoRU5qMaqL585nLAeRnvZ8j4BvWnM84WFTRAEU-0wWitaSZapJHSnr1Whv3uH3VB6qTLYStTHzmJIFTltJsVvZwBDUBX1L_arBb6TUNQN0LWzUNby4MjvCyvgHLq5GrqURiAE9Cj-r19wAGuGRLltXuqqbguddjbYlS4yUAudlfWkxdtrePyuDMUhlNtfvQhHsrUAtLdE7IxilA1uOEujzApcHRbQgEZEvBocO6egmu5X3hVjNsdfXNQyZEiowN7ByAXaX_VvhcA5jzQ6mHXrO2n0gJuBxFsJUnGn0p1bomkhvInhvBed5x3mt3250GYlzwHhWn7DfstL5-ENOi1Pe9qGyt3jpMPk72XlL0n1cacAA4oJjMHloxnDkVOyooeyx5w8r_HrkeqCxsuJq-CnTm3-XC62vxtF_7n4ih3CoaJG4B9qpQFjDhIRxhyoTMboftrPrc15DwkBZ8mfP0cJu7DvNdzMyMiK_ZbTTayhvjFK9os2UIdvaFPJb-2UYufq0C1prqUpOq4XKiUcMO4KSoodnuzyTzTKPQQ_tRYrzPe5yxX9nqc0wuL98mXmk8oDY_cFUV7_SRWReCqngsLrO2CfL9g90QAn6rPG9sWmTgQqBR7lKzr_nvMFHd6SmgleBdbk6CiE_I0TKefKX0jYQaf5-EjU6jkTZFTVebG2OYXaEAV6FgEA86MsV3hTEKndQNSvTUxjW-ekoEULLGkAz5ccnpFCk0HRNXIDaIm-qOJaxsy94GrnVLJ_ofZVM_Wqsp1ykKg=w2880-h1560-no?authuser=0" height=400 width=600/>

Let's assume we are at second balloon, to shoot two balloons at once, the starting of current balloon must be <= ending point of previous balloon, if it is so then we can
- take the interval reading as starting point = max(currStart, prevStart) and ending point = min(currEnd, prevEnd)
- if the balloons dont overlap, then increase arrow count, and move on to next balloon with current balloon being treated as previous balloon.
