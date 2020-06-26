$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/web/ceroshomepagetest.feature");
formatter.feature({
  "line": 3,
  "name": "Ceros filter test",
  "description": "",
  "id": "ceros-filter-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 4068112489,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "the ceros inspire home page is loaded",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageSteps.theCerosInspireHomePageIsLoaded()"
});
formatter.result({
  "duration": 2408569867,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "verifies the number of Industry menu items is 16.",
  "description": "",
  "id": "ceros-filter-test;verifies-the-number-of-industry-menu-items-is-16.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "the user clicks the \"Industry\" filter in the ceros homepage",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "the user should see 16 menu items displaying within the Industry dropdown in the ceros homepage",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Industry",
      "offset": 21
    }
  ],
  "location": "HomePageSteps.theUserClicksTheFilterInTheCerosHomepage(String)"
});
formatter.result({
  "duration": 2345249296,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "16",
      "offset": 20
    }
  ],
  "location": "HomePageSteps.theUserShouldSeeMenuItemsDisplayingWithinTheIndustryDropdownInTheCerosHomepage(int)"
});
formatter.result({
  "duration": 109471517,
  "status": "passed"
});
formatter.after({
  "duration": 211405134,
  "status": "passed"
});
formatter.before({
  "duration": 1953756526,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "the ceros inspire home page is loaded",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageSteps.theCerosInspireHomePageIsLoaded()"
});
formatter.result({
  "duration": 2212290506,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "verifies filter addition and image headers",
  "description": "",
  "id": "ceros-filter-test;verifies-filter-addition-and-image-headers",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "the user clicks the \"Industry\" filter in the ceros homepage",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "the user selects \"finance\" from the Industry dropdown in the ceros homepage",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "the user clicks the \"Type\" filter in the ceros homepage",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "the user selects \"content-hub\" from the Type dropdown in the ceros homepage",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "the user clicks the \"Feature\" filter in the ceros homepage",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "the user selects \"video\" from the Feature dropdown in the ceros homepage",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "the user should see the grid image",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "the user should see the \"Citywire\" header in the ceros homepage",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "the user should see the \"CEO Tapes\" subheader in the ceros homepage",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "the user should see breadcrumbs displayed in the ceros homepage",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Industry",
      "offset": 21
    }
  ],
  "location": "HomePageSteps.theUserClicksTheFilterInTheCerosHomepage(String)"
});
formatter.result({
  "duration": 3444848239,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "finance",
      "offset": 18
    }
  ],
  "location": "HomePageSteps.theUserSelectsFromTheIndustryDropdownInTheCerosHomepage(String)"
});
formatter.result({
  "duration": 253745363,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Type",
      "offset": 21
    }
  ],
  "location": "HomePageSteps.theUserClicksTheFilterInTheCerosHomepage(String)"
});
formatter.result({
  "duration": 582102207,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "content-hub",
      "offset": 18
    }
  ],
  "location": "HomePageSteps.theUserSelectsFromTheTypeDropdownInTheCerosHomepage(String)"
});
formatter.result({
  "duration": 299787770,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Feature",
      "offset": 21
    }
  ],
  "location": "HomePageSteps.theUserClicksTheFilterInTheCerosHomepage(String)"
});
formatter.result({
  "duration": 224782110,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "video",
      "offset": 18
    }
  ],
  "location": "HomePageSteps.theUserSelectsFromTheFeatureDropdownInTheCerosHomepage(String)"
});
formatter.result({
  "duration": 258614363,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.theUserShouldSeeTheGridImage()"
});
formatter.result({
  "duration": 184009794,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Citywire",
      "offset": 25
    }
  ],
  "location": "HomePageSteps.theUserShouldSeeTheHeaderInTheCerosHomepage(String)"
});
formatter.result({
  "duration": 64589694,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "CEO Tapes",
      "offset": 25
    }
  ],
  "location": "HomePageSteps.theUserShouldSeeTheSubheaderInTheCerosHomepage(String)"
});
formatter.result({
  "duration": 64395153,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.theUserShouldSeeBreadcrumbsDisplayedInTheCerosHomepage()"
});
formatter.result({
  "duration": 85370410,
  "status": "passed"
});
formatter.after({
  "duration": 252331328,
  "status": "passed"
});
});