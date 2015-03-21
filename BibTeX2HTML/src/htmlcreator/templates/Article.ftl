<#import "Base.ftl" as Base>

<@Base.page>
	<h2>Article</h2>

	<ul>
		<li><strong>Key:</strong> ${ArticleData.citationKey}</li>
		<li><strong>Author:</strong> ${ArticleData.author}</li>
		<li><strong>Title:</strong> ${ArticleData.title}</li>
		<li><strong>Journal:</strong> ${ArticleData.journal}</li>
		<li><strong>Year:</strong> ${ArticleData.year}</li>
		<#if ArticleData.volume??>
			<p><strong>Volume:</strong> ${ArticleData.volume}</p>
		</#if>
		<#if ArticleData.number??>
			<p><strong>Number:</strong> ${ArticleData.number}</p>
		</#if>
		<#if ArticleData.pages??>
			<p><strong>Pages:</strong> ${ArticleData.pages}</p>
		</#if>
		<#if ArticleData.month??>
			<p><strong>Month:</strong> ${ArticleData.month}</p>
		</#if>
		<#if ArticleData.note??>
			<p><strong>Note:</strong> ${ArticleData.note}</p>
		</#if>
		<#if ArticleData.key??>
			<p><strong>Key:</strong> ${ArticleData.key}</p>
		</#if>
	</ul>
</@Base.page> 