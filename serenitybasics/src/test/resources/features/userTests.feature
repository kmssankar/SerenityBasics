Feature: Test Authenticated user

Scenario: verify Authenticated user
Given As a Authorized user with Valid access
When when requests for Account info Account/v1/User/
Then get non empty user info as result